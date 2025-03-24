## Flyweight Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Object တွေအများကြီးကို memory-efficient ဖြစ်အောင် share လုပ်ပြီး အသုံးပြုနိုင်စေပါတယ် <br>
ထပ်တူ object တွေကို ထပ်ခါထပ်ခါ မဆောက်ဘဲ၊ ရှိပြီးသား object တွေကို ပြန်သုံးစေပါတယ်

ဥပမာ - Text Editor

- စာလုံးတူတွေအတွက် object အသစ်တွေ ထပ်မဆောက်ဘဲ
- တူညီတဲ့ font, style ရှိတဲ့ character တွေကို share လုပ်သုံးပါတယ်
- Position, size, color စတာတွေကိုတော့ သီးခြားစီ သိမ်းထားပါတယ်

### အားသာချက်များ (Pros)

- Memory သုံးစွဲမှု လျှော့ချနိုင်ခြင်း
- Performance ပိုကောင်းလာခြင်း
- Resource sharing ကြောင့် system ပိုမိုထိရောက်လာခြင်း

### အားနည်းချက်များ (Cons)

- Code ပိုရှုပ်ထွေးလာ (state ခွဲခြားရလို့)
- Thread safety issues ဖြစ်နိုင်
- Debug လုပ်ရခက်ခဲ

</div>