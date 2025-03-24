## Facade Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Complex system တစ်ခုကို ရိုးရှင်းတဲ့ interface တစ်ခုနဲ့ အသုံးပြုနိုင်အောင် လုပ်ပေးပါတယ် <br>
Subsystem တွေရဲ့ ရှုပ်ထွေးမှုကို client ဆီက ဖုံးကွယ်ထားပါတယ်

ဥပမာ - Computer System

- Computer စက်ကို start လုပ်ဖို့ CPU, Memory, Hard Drive စတဲ့ component တွေအများကြီးနဲ့ ဆက်သွယ်အလုပ်လုပ်ရပါတယ်
- Facade က အဲ့ဒီ complexity တွေကို ဖုံးကွယ်ပြီး startComputer(), shutdownComputer() လို ရိုးရှင်းတဲ့ method တွေပဲ ပေးထားပါတယ်

### အားသာချက်များ (Pros)

- System ကို အသုံးပြုရတာ ပိုလွယ်ကူလာခြင်း
- Subsystem တွေကို loosely coupled ဖြစ်စေခြင်း
- Code ပိုရှင်းလင်းလာခြင်း

### အားနည်းချက်များ (Cons)

- Facade class က god object ဖြစ်သွားနိုင်
- Flexibility နည်းပါးလာနိုင်
- Subsystem နဲ့ တိုက်ရိုက်ဆက်သွယ်မှု ခက်ခဲလာ

</div>