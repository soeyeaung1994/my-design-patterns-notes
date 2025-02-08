## Prototype Pattern

### ဒီ Prototype Pattern က existing object တွေကနေ copy ကူးပြီး object အသစ်တွေဆောက်ချင်တဲ့အခါသုံးပါတယ်။ လက်တွေ့အသုံးချနိုင်တဲ့ နေရာတွေကတော့ ...

<div style="font-size:14px;line-height: 2;">

- **Document template တွေ** (စာချုပ်စာတမ်း၊ အစီရင်ခံစာ၊ CV)

- **Game object တွေ** (ရန်သူ၊ item၊ obstacle)

- **UI component တွေ** (button၊ form၊ dialog)

- **Database record တွေ copy ကူးခြင်း**

- **Product catalog တွေ** (တူညီတဲ့ပစ္စည်းတွေကို အရောင်အမျိုးမျိုးပြောင်းတာ)

- **Configuration settings တွေ** (default setting ကနေ customize လုပ်တာ)

- **Drawing tool တွေ** (shape တွေကို copy & paste လုပ်တာ)

**Prototype Pattern သုံးခြင်းရဲ့ အားသာချက်များ**

- Object တွေကို dynamic ဆောက်နိုင်
- Complex objects တွေကို လွယ်လွယ်ကူးယူနိုင်
- Subclassing လုပ်စရာမလိုပဲ new objects တွေရနိုင်
- Configuration heavy objects တွေကို pre-build လုပ်ထားနိုင်

**သတိထားရမယ့်အချက်များ**

- Circular references တွေရှိရင် clone လုပ်ရခက်
- Deep copy လုပ်ရတာခက်ခဲ
- Complex constructor တွေပါရင် clone လုပ်ရခက်
- Mutable state တွေပါရင် သတိထားရ

</div>

### တခြား ကိုယ်စဉ်းစားမိသေးတဲ့ ဥပမာလေးတွေလည်းရှိတယ်ဆိုရင် ဒီမှာ အကြံပြုပြီး ထပ်မံဖြည့်စွက်ပေးနိုင်ပါတယ်။