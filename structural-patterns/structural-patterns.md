## Structural Patterns

<div style="font-size:14px;line-height: 2;">

**Structural Design Pattern** ဆိုတာ object တွေကို ဘယ်လို organize လုပ်မလဲ၊ class တွေကို ဘယ်လို compose လုပ်မလဲဆိုတာနဲ့ ပတ်သက်တဲ့ design pattern အမျိုးအစားတစ်ခု ဖြစ်ပါတယ်။ <br>
Structural Pattern က အဓိကအားဖြင့် နှစ်ပိုင်းပါဝင်ပါတယ်။

**၁။ Class တွေ ဘယ်လို Structure လုပ်မလဲ**

- Class တွေကြား inheritance ဆက်နွယ်မှု
- Interface တွေကို ဘယ်လို implement လုပ်မလဲ
- Abstract class တွေကို ဘယ်လို အသုံးချမလဲ

**၂။ Object တွေကို ဘယ်လို Compose လုပ်မလဲ**

- Object တွေကြား ဆက်သွယ်မှု
- Object တွေကို ဘယ်လို ပေါင်းစပ်မလဲ
- Functionality တွေကို ဘယ်လို share လုပ်မလဲ <hr>

### Structural Pattern ၏ အဓိက ရည်ရွယ်ချက်များ

**Code Reusability တိုးမြှင့်ရန်**

- ရှိပြီးသား code တွေကို ပြန်သုံးနိုင်အောင်
- Common functionality တွေကို share လုပ်နိုင်အောင်


**Flexibility ပိုကောင်းအောင်**

- System ကို လွယ်ကူစွာ ပြောင်းလဲနိုင်အောင်
- Component တွေကို လွတ်လပ်စွာ ပြောင်းလဲနိုင်အောင်


**Complexity စီမံရန်**

- Complex system တွေကို organize လုပ်ရလွယ်ကူအောင်
- System ရဲ့ ရှုပ်ထွေးမှုတွေကို ဖုံးကွယ်ထားနိုင်အောင် <hr>

### Structural Patterns မှာ အဓိက (၇) မျိုးရှိပါတယ်။ <br><br>

**၁။ Adapter Pattern:**
- interface နှစ်ခု မတူညီတဲ့အခါ၊ ကြားခံ adapter class တစ်ခုကိုသုံးပြီး အဲ့ဒီ interface နှစ်ခုကို အတူတကွ အလုပ်လုပ်နိုင်အောင် ပေါင်းကူးပေးတဲ့ pattern တစ်ခုဖြစ်ပါတယ်။
- Interface မတူတဲ့ class နှစ်ခုကို အတူတကွ အလုပ်လုပ်နိုင်အောင်
- ဥပမာ - ဘဏ်စနစ်မတူတဲ့ payment gateway နှစ်ခုကို တူညီတဲ့ interface နဲ့သုံးနိုင်အောင်လုပ်တာ 

**၂။ Bridge Pattern:**
- abstraction နဲ့ implementation ကို သီးခြားစီခွဲထားပြီး နှစ်ဖက်စလုံးကို တစ်ခုနဲ့တစ်ခု မထိခိုက်စေဘဲ သီးခြားစီ ပြောင်းလဲနိုင်အောင် လုပ်ပေးတဲ့ pattern တစ်ခုဖြစ်ပါတယ်။
- Abstraction နဲ့ Implementation ကို ခွဲခြားထားခြင်း
- ဥပမာ - UI component တွေနဲ့ ၎င်းတို့ရဲ့ platform-specific implementation တွေကို သီးခြားစီထားတာ

**၃။ Composite Pattern:**
- ဒီ pattern က tree-like သို့မဟုတ် hierarchical structure တွေကို ကိုင်တွယ်ဖို့အတွက် အသုံးပြုပါတယ်။
- Object တွေကို tree structure အနေနဲ့ စီစဉ်ခြင်း
- ဥပမာ - File system မှာ folder တွေထဲ file တွေထည့်သလိုမျိုး

**၄။ Decorator Pattern:**  
- Object တွေရဲ့ behavior ကို dynamically modify လုပ်နိုင်ဖို့အတွက် အသုံးပြုပါတယ်။
- Object တွေကို dynamically functionality ထပ်ထည့်ခြင်း
- ဥပမာ - ကော်ဖီမှာ နို့၊ သကြား စတာတွေ ထပ်ထည့်သလိုမျိုး

**၅။ Facade Pattern:**  
- Complex system တစ်ခုကို ရိုးရှင်းတဲ့ interface တစ်ခုနဲ့ အသုံးပြုနိုင်အောင် ဖန်တီးပေးတဲ့ pattern ဖြစ်ပါတယ်။
- Complex system တစ်ခုအတွက် ရိုးရှင်းတဲ့ interface ပေးခြင်း
- ဥပမာ - Computer စနစ်မှာ start, shutdown လိုမျိုးရိုးရှင်းတဲ့ command တွေပဲပေးတာ

**၆။ Flyweight Pattern:**  
- Object တွေအများကြီးကို memory-efficient ဖြစ်အောင် sharing လုပ်ပြီး အသုံးပြုနိုင်ဖို့အတွက် သုံးတဲ့ pattern ဖြစ်ပါတယ်။
- Similar object တွေများများကို efficient ဖြစ်အောင် စီမံခြင်း
- ဥပမာ - Text editor မှာ font character တွေကို share လုပ်သုံးတာ

**၇။ Proxy Pattern:**  
- Object တစ်ခုကို တိုက်ရိုက် access လုပ်တာထက် proxy object တစ်ခုကနေတဆင့် access လုပ်စေချင်တဲ့အခါ သုံးတဲ့ pattern ဖြစ်ပါတယ်။
- Object တစ်ခုကို တိုက်ရိုက်မသုံးဘဲ ကြားခံထားခြင်း
- ဥပမာ - ပုံကြီးတွေကို lazy loading လုပ်တာ <hr>

### Structural Pattern တွေရဲ့ အရေးပါပုံ

**Better Code Organization**

- Code structure ပိုကောင်းလာခြင်း
- ပြောင်းလဲမှုတွေ လုပ်ရတာ ပိုလွယ်ကူလာခြင်း

**Easier Maintenance**

- Code ကို ပြင်ဆင်ရလွယ်ကူလာခြင်း
- Bug တွေ ရှာရတာ ပိုလွယ်လာခြင်း

**Better Scalability**

- System ကို တိုးချဲ့ရတာ လွယ်ကူလာခြင်း
- Feature အသစ်တွေ ထပ်ထည့်ရတာ လွယ်ကူလာခြင်း

**Structural Pattern** တွေဟာ complex system တွေကို organize လုပ်ရာမှာ အရေးပါတဲ့ အခန်းကဏ္ဍက ပါဝင်ပါတယ်။ <br>
သူတို့ကို သင့်တော်သလို အသုံးချခြင်းဖြင့် system တစ်ခုရဲ့ maintainability နဲ့ flexibility ကို သိသိသာသာ တိုးတက်စေနိုင်ပါတယ်။
</div>