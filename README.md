# All about Design Patterns in Burmese

### ဒီ repository လေးကတော့ ကျွန်တော့်ကိုယ်ပိုင်အတွက် Design Patterns မှတ်စုလေးဖြစ်ပါတယ်။ Design Patterns နားလည်လိုသူတိုင်း လေ့လာ၊ မှီငြမ်းအသုံးပြုနိုင်ပါတယ် ခင်ဗျာ။
<div style="font-size:14px;line-height: 2;">
Design Patterns ဆိုတာ programming မှာ အတွေ့များတဲ့ ပြဿနာတွေကို ဖြေရှင်းတဲ့ နည်းလမ်းကောင်းတွေကို စုစည်းထားတာပါ။ ဥပမာ၊ ကားတစ်စီးထုတ်လုပ်မယ်ဆိုရင် ဘီးတပ်ရမယ်၊ အင်ဂျင်တပ်ရမယ်၊ ဘရိတ်တပ်ရမယ်ဆိုတာမျိုးပါ။ နှစ်ပေါင်းများစွာ programmer တွေရဲ့ အတွေ့အကြုံကနေ စုဆောင်းထားတဲ့ အကောင်းဆုံး practices တွေဆိုပါတော့။
Design Patterns တွေကို အဓိက category ကြီး သုံးခုခွဲထားပါတယ်။


## ၁။ Creational Patterns 
Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.<br>
ဒါက object တွေကို ဘယ်လိုအကောင်းဆုံး create လုပ်မလဲဆိုတဲ့ pattern တွေပါ။ အသုံးများတဲ့ pattern တွေက

**Singleton Pattern:** object တစ်ခုကနေ instance တစ်ခုပဲရှိစေချင်တဲ့အခါ သုံးပါတယ်။ ဥပမာ၊ database connection တစ်ခုပဲ လိုချင်တဲ့အခါမျိုး <br>
**Factory Pattern:** object တွေကို central place ကနေ create လုပ်ချင်တဲ့အခါသုံးပါတယ်။ ဥပမာ၊ အမျိုးမျိုးသော document တွေ create လုပ်တဲ့အခါ (PDF, Word, Excel)

## ၂။ Structural Patterns
Structural design patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.<br>
ဒါက class တွေ object တွေကို ဘယ်လိုစနစ်တကျ ဖွဲ့စည်းမလဲဆိုတဲ့ pattern တွေပါ။ အသုံးများတာတွေက

**Adapter Pattern:** interface နှစ်ခုကို compatible ဖြစ်အောင်လုပ်ချင်တဲ့အခါသုံးပါတယ်။ ဥပမာ၊ payment gateway interface တွေကို standardize လုပ်တဲ့အခါ <br>
**Decorator Pattern:** object တစ်ခုမှာ feature တွေ dynamic ထပ်ထည့်ချင်တဲ့အခါသုံးပါတယ်။ ဥပမာ၊ coffee order မှာ topping တွေထပ်ထည့်သလိုမျိုး

## ၃။ Behavioral Patterns
Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.<br>
ဒါက object တွေအချင်းချင်း ဘယ်လိုဆက်သွယ်ပြီး အလုပ်လုပ်မလဲဆိုတဲ့ pattern တွေပါ။ အသုံးများတာတွေက

**Observer Pattern:** object တစ်ခုက state ပြောင်းသွားရင် တခြား object တွေကို automatically notify လုပ်ချင်တဲ့အခါသုံးပါတယ်။ ဥပမာ၊ UI update လုပ်တဲ့အခါ <br>
**Strategy Pattern:** algorithm တွေကို runtime မှာ ပြောင်းလဲချင်တဲ့အခါသုံးပါတယ်။ ဥပမာ၊ payment method တွေ dynamic ပြောင်းတဲ့အခါ

Design Patterns တွေကို ဘာကြောင့်သိထားသင့်လဲဆိုတော့

**၁။ ကိုယ့်ရဲ့ code က maintainable ဖြစ်လာမယ်။ Pattern တွေက proven solutions တွေဖြစ်တဲ့အတွက် နောက်ပိုင်း bug fix လုပ်ရတာ၊ feature အသစ်ထည့်ရတာ ပိုလွယ်မယ်။ <br>
၂။ တခြား developer တွေနဲ့ communication ပိုကောင်းလာမယ်။ "ဒီနေရာမှာ Observer Pattern သုံးထားတယ်" လို့ပြောလိုက်ရင် တခြား developer တွေ ချက်ချင်းနားလည်သွားမယ်။ <br>
၃။ ကိုယ့်ရဲ့ code architecture ပိုကောင်းလာမယ်။ Pattern တွေက code organization ကို systematic ဖြစ်စေတယ်။ <br>
၄။ Common problems တွေကို ထပ်ခါထပ်ခါ solve လုပ်နေစရာမလိုတော့ဘူး။ Pattern တွေက proven solutions တွေမို့လို့ အချိန်ကုန်သက်သာမယ်။**

ဒါပေမယ့် သတိထားရမှာက pattern တွေကို overuse မလုပ်မိဖို့ပါ။ Simple problem တစ်ခုကို pattern တွေသုံးပြီး complex ဖြစ်အောင်မလုပ်သင့်ပါဘူး။ 

**"Keep It Simple, Stupid" (KISS) principle ကို အမြဲသတိရပါ။**

မှတ်ထားရမှာက pattern တွေက tool box ထဲက tool တွေလိုပါပဲ။ ဘယ် pattern က ဘယ်နေရာမှာ အသုံးဝင်တယ်ဆိုတာ သိထားဖို့အရေးကြီးသလို၊ ဘယ်နေရာမှာ မသုံးသင့်ဘူးဆိုတာလည်း သိထားဖို့လိုပါတယ်။ 
Experience ရလာတာနဲ့အမျှ ဒါတွေက automatically သိလာမှာပါ။
</div>