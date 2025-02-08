package abstractFactory.architectureFactory;

import abstractFactory.architectureFactory.interfaces.Window;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:50 am
 */
public class VintageWindow implements Window {
    @Override
    public void install() {
        System.out.println("ရှေးဟောင်းပုံစံ ပြတင်းပေါက်တပ်ဆင်သည်");
    }
}
