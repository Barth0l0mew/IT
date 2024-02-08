package OOP.FuncInterfaces;

import java.util.ArrayList;
import java.util.List;

public class FuncInterface {
    public static void main(String[] args) {
        //функциональное вырожение
    ElectricalDevice lamp = state -> {
        System.out.println(state?"Лампочка Вкл":"Лампочка Выкл");
    };
    Button button = new Button(lamp);
    button.switchOnOff();
    button.switchOnOff();
    Button button1 = new Button(new Iron());
    button1.switchOnOff();
    button1.switchOnOff();
    ElectricalDevice fan = new ElectricalDevice() {
        @Override
        public void switchOnOff(boolean state) {
            System.out.println(state?"Фен Вкл":"Фен Выкл");
        }
    };
    Button button2 = new Button(fan);
    button2.switchOnOff();
    button2.switchOnOff();
    List<ElectricalDevice> devices = new ArrayList<>();
    devices.add(new Iron());
    devices.add(new Iron());
    ButtonEx buttonEx = new ButtonEx(devices);
     buttonEx.switchOnOff();
    buttonEx.switchOnOff();
    }
}

//электрическая кнопка (вкл.выкл)
class Button {
    protected boolean state = false;//выключена

    private ElectricalDevice device;
    public Button(){};
    public Button(ElectricalDevice device) {
        this.device = device;
    }

    public void switchOnOff() {
        state = !state;
        if (state)
            System.out.println("Кнопка включена");
        else
            System.out.println("Кнопка выключена");

        device.switchOnOff(state);
    }
}
@FunctionalInterface
interface ElectricalDevice{
    void switchOnOff(boolean state);
}
class Iron implements ElectricalDevice {

    @Override
    public void switchOnOff(boolean state) {
        System.out.println(state?"Утюг Вкл":"Утюг Выкл");
    }
}
class ButtonEx extends Button{
    private List<ElectricalDevice> devices;
//    public ButtonEx (ElectricalDevice device){
//        super(device);
//        devises.add(device);
//    }
    public ButtonEx(List<ElectricalDevice> devices){
        this.devices= devices;
    }
    public void switchOnOff(){
        state = !state;
        if (state)
            System.out.println("Кнопка включена");
        else
            System.out.println("Кнопка выключена");

        for (ElectricalDevice device:devices)
            device.switchOnOff(state);
    }
}
