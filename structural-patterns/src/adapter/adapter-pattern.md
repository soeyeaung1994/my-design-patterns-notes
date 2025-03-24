## Adapter Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Interface နှစ်ခုက တူညီမှုမရှိတဲ့အခါ၊ အဲ့ဒီ interface နှစ်ခုကို ချိတ်ဆက်အသုံးပြုနိုင်အောင် လုပ်ပေးတဲ့ pattern ပါ <br>
ရှိပြီးသား code တွေကို ပြင်ဆင်စရာမလိုဘဲ interface အသစ်နဲ့ အလုပ်လုပ်နိုင်အောင် လုပ်ပေးပါတယ်

ဥပမာ - Payment Gateway Integration

KBZ Pay နဲ့ Wave Pay လို payment system တွေမှာ တူညီတဲ့ operation (processPayment) ကို interface အနေနဲ့သတ်မှတ်ပြီး
System တခုချင်းစီအတွက် Adapter class တွေနဲ့ ချိတ်ဆက်ထားတာကို တွေ့ရမှာပါ <br>
အဲ့ဒီ adapter တွေက ရှိပြီးသား payment system တွေရဲ့ API တွေကို ကိုယ်လိုချင်တဲ့ interface ပုံစံနဲ့ အလုပ်လုပ်နိုင်အောင် ပြောင်းပေးတာပါ

### အားသာချက်များ (Pros)

- Code reuse လုပ်နိုင်ခြင်း
- ရှိပြီးသား code တွေကို မပြင်ဘဲ interface အသစ်နဲ့ အလုပ်လုပ်နိုင်ခြင်း
- System ချိတ်ဆက်မှုတွေကို ပိုမိုလွယ်ကူစေခြင်း

### အားနည်းချက်များ (Cons)

- Code ပိုရှုပ်ထွေးလာ (adapter class အသစ်တွေ ထပ်ဖြစ်လာ)
- Performance အနည်းငယ်ကျဆင်းနိုင် (extra layer တစ်ခု ဖြတ်ရလို့)
- Interface မတူတဲ့ ပြဿနာကို အခြေခံကနေ မဖြေရှင်းဘဲ workaround လုပ်သလိုဖြစ်နေနိုင်

</div>