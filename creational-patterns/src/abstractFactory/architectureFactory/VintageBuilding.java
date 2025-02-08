package abstractFactory.architectureFactory;

import abstractFactory.architectureFactory.interfaces.Building;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:50 am
 *
 * ခေတ်ဟောင်းအဆောက်အအုံအတွက် products များ
 *
 */

public class VintageBuilding implements Building {
    @Override
    public void design() {
        System.out.println("ရှေးဟောင်းဗိသုကာပုံစံဖြင့် ဒီဇိုင်းရေးဆွဲသည်");
    }
}
