## Combined Pattern (E-commerce System)

<div style="font-size:14px;line-height: 2;">

Structural Pattern တွေ တွဲသုံးတဲ့ ဥပမာတစ်ခုအနေနဲ့ E-commerce system တစ်ခုမှာ Payment နဲ့ Notification system ကို ပြပါမယ်။
Adapter + Decorator + Facade pattern တွေကို တွဲသုံးမှာဖြစ်ပါတယ်။

ဒီ System မှာ၊

- **Adapter Pattern** - payment gateway တွေကို standard interface တစ်ခုနဲ့ အလုပ်လုပ်နိုင်အောင် adapt လုပ်ထားပါတယ်
- **Decorator Pattern** - payment process မှာ logging, notification စတဲ့ feature တွေ ထပ်ထည့်ဖို့သုံးထားပါတယ်
- **Facade Pattern** - ရှုပ်ထွေးတဲ့ payment နဲ့ notification process တွေကို client အတွက် ရိုးရှင်းအောင် wrap လုပ်ထားပါတယ်

### Pattern တွေကို ဘာကြောင့် တွဲသုံးသလဲဆိုတော့

**Adapter Pattern သုံးရတဲ့အကြောင်း**

Payment gateway တွေက သူ့ API နဲ့သူရှိကြပါတယ်
ကိုယ့် system မှာ standard interface တစ်ခုနဲ့ အလုပ်လုပ်စေချင်တဲ့အခါ adapter လိုအပ်ပါတယ်
နောက်ပိုင်း payment gateway အသစ်တွေ ထပ်ထည့်တဲ့အခါ လွယ်ကူစေပါတယ်

**Decorator Pattern သုံးရတဲ့အကြောင်း**

Payment process မှာ logging, notification စတဲ့ feature တွေ ထပ်ထည့်ချင်တဲ့အခါ
ရှိပြီးသား code တွေကို မပြင်ဘဲ feature အသစ်တွေ ထပ်ထည့်နိုင်ပါတယ်
Feature တွေကို flexible ဖြစ်ဖြစ် ထည့်/ဖြုတ် လုပ်နိုင်ပါတယ်

**Facade Pattern သုံးရတဲ့အကြောင်း**

Payment နဲ့ notification process တွေက ရှုပ်ထွေးပါတယ်
Client တွေအတွက် ရိုးရှင်းတဲ့ interface တစ်ခု လိုအပ်ပါတယ်
Implementation details တွေကို ဖုံးကွယ်ထားချင်တဲ့အခါ သုံးပါတယ်
<hr>

### Pattern တွေ တွဲသုံးခြင်းရဲ့ အားသာချက်များ (Pros)

**Flexibility ပိုရှိခြင်း**

* System ရဲ့ အစိတ်အပိုင်းတစ်ခုချင်းစီကို သီးခြားစီ ပြောင်းလဲနိုင်ပါတယ်
* Feature အသစ်တွေ ထပ်ထည့်ရတာ လွယ်ကူပါတယ်

**Code Reusability**

* Pattern တစ်ခုချင်းစီရဲ့ အားသာချက်တွေကို အသုံးချနိုင်ပါတယ်
* Code duplicatation နည်းပါးစေပါတယ်

**Maintainability**

* Code structure ပိုကောင်းလာပါတယ်
* Single Responsibility Principle ကို လိုက်နာနိုင်ပါတယ်
<hr>

### သတိထားရမယ့်အချက်များ (Cons)

**Complexity ပိုများလာနိုင်**

* Pattern တွေများလာတာနဲ့အမျှ code က ပိုရှုပ်ထွေးလာနိုင်ပါတယ်
* Project scale ပေါ်မူတည်ပြီး သင့်တော်တဲ့ pattern တွေကိုပဲ ရွေးသုံးသင့်ပါတယ်

**Performance Impact**

* Pattern တွေများလာရင် object creation နဲ့ method calls တွေ များလာပါတယ်
* Performance critical ဖြစ်တဲ့နေရာတွေမှာ ဂရုစိုက်ပြီး သုံးသင့်ပါတယ်

**ဒါကြောင့် pattern တွေကို တွဲသုံးတဲ့အခါ project requirement နဲ့ scale ပေါ်မူတည်ပြီး သင့်တော်သလို ရွေးချယ်သုံးစွဲသင့်ပါတယ်။**

</div>