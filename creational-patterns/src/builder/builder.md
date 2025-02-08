## Builder Pattern

### ဒီ Builder Pattern က complex object တွေကို step by step ဆောက်ချင်တဲ့အခါသုံးပါတယ်။ လက်တွေ့အသုံးချနိုင်တဲ့ နေရာတွေကတော့ ...

<div style="font-size:14px;line-height: 2;">

- **Custom computer တည်ဆောက်ခြင်း** (CPU, RAM, HDD အမျိုးမျိုး)

- **အိမ်အမျိုးအစားတွေ တည်ဆောက်ခြင်း** (နှစ်ထပ်၊ တိုက်၊ ဘန်ဂလို)

- **စားသောက်ဆိုင် order တွေ** (ထမင်းဘူး၊ ကော်ဖီ၊ ဘာဂါ)

- **Document builder** (PDF, HTML, Word)

- **ခရီးစဉ်စီစဉ်ခြင်း** (လေယာဉ်လက်မှတ်၊ ဟိုတယ်၊ ခရီးသွားအာမခံ)

- **ကိုယ်ပိုင်စိတ်ကြိုက် pizza မှာယူခြင်း** (အရွယ်အစား၊ ကြက်သား/အသား၊ ဟင်းသီးဟင်းရွက်)

- **Game character creation** (ရုပ်သွင်ပြင်၊ စွမ်းရည်၊ လက်နက်)

**Builder Pattern သုံးခြင်းရဲ့ အားသာချက်များ**

- Object creation process ကို step by step လုပ်နိုင်
- Parameter တွေများတဲ့ constructor တွေကို ရှင်းလင်းအောင်လုပ်နိုင်
- Object တွေကို immutable လုပ်နိုင်
- Object creation လုပ်တဲ့အခါ validation လုပ်နိုင် 
- Fluent interface pattern နဲ့တွဲသုံးလို့ရ

**သတိထားရမယ့်အချက်များ**

- Boilerplate code များလာနိုင်
- Complexity တက်လာနိုင်
- Code duplication ဖြစ်လာနိုင်
- Memory usage များလာနိုင်

</div>

### တခြား ကိုယ်စဉ်းစားမိသေးတဲ့ ဥပမာလေးတွေလည်းရှိတယ်ဆိုရင် ဒီမှာ အကြံပြုပြီး ထပ်မံဖြည့်စွက်ပေးနိုင်ပါတယ်။