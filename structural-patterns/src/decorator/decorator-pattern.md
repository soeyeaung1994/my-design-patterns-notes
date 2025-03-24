## Decorator Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Object တွေရဲ့ behavior ကို runtime မှာ ပြောင်းလဲနိုင်အောင် လုပ်ပေးတဲ့ pattern ပါ <br>
Class တွေ အများကြီး inheritance လုပ်စရာမလိုဘဲ feature အသစ်တွေ ထပ်ထည့်နိုင်ပါတယ်

ဥပမာ - Coffee Shop

- အခြေခံကော်ဖီမှာ နို့၊ သကြား စတာတွေ ထည့်တဲ့အခါ
- Base coffee object ကို decorator တွေနဲ့ wrap လုပ်ပြီး feature အသစ်တွေ ထပ်ထည့်တာကို တွေ့ရမှာပါ
- ဒီနည်းနဲ့ မတူညီတဲ့ကော်ဖီအမျိုးအစားတွေကို လွယ်လွယ်နဲ့ ဖန်တီးနိုင်ပါတယ်

### အားသာချက်များ (Pros)

- Runtime မှာ behavior တွေ ပြောင်းလဲနိုင်ခြင်း
- Single Responsibility Principle ကို လိုက်နာနိုင်ခြင်း
- Inheritance ကို အလွန်အကျွံမသုံးဘဲ feature တွေ ထပ်ထည့်နိုင်ခြင်း

### အားနည်းချက်များ (Cons)

- Decorator တွေများလာရင် code tracking ခက်ခဲလာ
- Decorator တွေရဲ့ အစီအစဉ်က အရေးကြီးလာတတ်
- Initial code ပိုရှုပ်ထွေးနိုင်

</div>