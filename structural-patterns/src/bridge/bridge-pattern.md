## Bridge Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Abstraction နဲ့ Implementation ကို သီးခြားစီခွဲထားပြီး၊ နှစ်ခုလုံးကို လွတ်လပ်စွာ ပြောင်းလဲနိုင်အောင် လုပ်ထားတဲ့ pattern ပါ <br>
Inheritance အစား Composition ကို အသုံးပြုထားပါတယ်

ဥပမာ - Message System

- Message အမျိုးအစားတွေ (Text, Image) နဲ့
- ပို့ဆောင်တဲ့နည်းလမ်းတွေ (Email, SMS) ကို သီးခြားစီ ခွဲထားပါတယ်
- ဒီလိုခွဲထားခြင်းအားဖြင့် Message အမျိုးအစားအသစ် (Video) သို့မဟုတ် ပို့ဆောင်နည်းအသစ် (Telegram) တွေ ထပ်ထည့်ရတာ လွယ်ကူစေပါတယ်

### အားသာချက်များ (Pros)

- ပြောင်းလဲမှုတွေကို လွယ်ကူစွာလုပ်နိုင်ခြင်း
- Code ရဲ့ structure ပိုကောင်းလာခြင်း
- Single Responsibility Principle ကို လိုက်နာနိုင်ခြင်း

### အားနည်းချက်များ (Cons)

- Design ပိုရှုပ်ထွေးလာ
- Setup လုပ်ရတာ အချိန်ပိုကုန်
- Project သေးရင် over-engineering ဖြစ်နိုင်

</div>