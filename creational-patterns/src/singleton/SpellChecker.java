package singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Soe Ye Aung
 * @Date: 5/2/25
 * @Time: 10:06 am
 */
public final class SpellChecker {
    private static final SpellChecker INSTANCE = new SpellChecker();
    private final Set<String> dictionary;

    private SpellChecker() {
        // Dictionary ကို initialize လုပ်တဲ့နေရာ
        dictionary = new HashSet<>();
        loadDictionary();
    }

    public static SpellChecker getInstance() {
        return INSTANCE;
    }

    private void loadDictionary() {
        // Dictionary file ကနေ စာလုံးတွေကို load လုပ်
        // (ဥပမာအနေနဲ့ ရိုးရှင်းအောင်ထားပါတယ်)
        dictionary.add("hello");
        dictionary.add("world");
    }

    public boolean checkWord(String word) {
        return dictionary.contains(word.toLowerCase());
    }
}
