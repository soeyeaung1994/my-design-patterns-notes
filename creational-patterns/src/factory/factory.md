## Factory Pattern

### ဒီ Factory Pattern က object တွေကို central place တစ်ခုကနေ create လုပ်ချင်တဲ့အခါသုံးပါတယ်။ လက်တွေ့အသုံးချနိုင်တဲ့ နေရာတွေကတော့ ...

<div style="font-size:14px;line-height: 2;">

- **လုံခြုံရေးဆိုင်ရာ authentication providers တွေ** (Facebook login, Google login, Email login)

- **ပုံစံအမျိုးမျိုးသော file formats တွေ** (PDF, Word, Excel)

- **ကားအမျိုးအစားအမျိုးမျိုး** (Sedan, SUV, Van)

- **သယ်ယူပို့ဆောင်ရေး services တွေ** (ကုန်းလမ်း၊ ရေလမ်း၊ လေကြောင်း)

- **အားကစားပစ္စည်း အမျိုးအစားတွေ** (ဘောလုံး၊ တင်းနစ်၊ ဘတ်စကတ်ဘော)

- **Payment methods တွေ** (ဆက်သွယ်ရေး၊ ဘဏ်၊ fintech)

- **UI components တွေ** (Button, TextBox, Checkbox)

Java 21 ရဲ့ feature အသစ်တွေဖြစ်တဲ့

- Record classes
- Sealed interfaces
- Pattern matching for switch
- String templates (STR."...")
တွေကို သုံးထားပါတယ်။

Factory pattern ကို သုံးခြင်းအားဖြင့်

- Object creation logic ကို centralize လုပ်နိုင်
- Implementation details တွေကို client code ကနေ hide လုပ်နိုင်
- New types တွေ ထပ်ထည့်ဖို့ လွယ်ကူ
- Testing လုပ်ရတာ ပိုလွယ်ကူ

စတဲ့ အားသာချက်တွေ ရရှိပါတယ်။

</div>

### တခြား ကိုယ်စဉ်းစားမိသေးတဲ့ ဥပမာလေးတွေလည်းရှိတယ်ဆိုရင် ဒီမှာ အကြံပြုပြီး ထပ်မံဖြည့်စွက်ပေးနိုင်ပါတယ်။