package abstractFactory.architectureFactory;

import abstractFactory.architectureFactory.interfaces.Door;

/**
 * @Author: Soe Ye Aung
 * @Date: 8/2/25
 * @Time: 10:55 am
 */
public class VintageDoor implements Door {
    @Override
    public void construct() {
        System.out.println("ရှေးဟောင်းဗိသုကာပုံစံဖြင့် တံခါးပေါက်တပ်ဆင်သည်");
    }
}
