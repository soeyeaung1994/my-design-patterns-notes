## Proxy Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Object တစ်ခုကို တိုက်ရိုက် access မလုပ်ဘဲ proxy object တစ်ခုကနေတဆင့် access လုပ်စေပါတယ် <br>
Access control, lazy loading, logging စတာတွေ လုပ်နိုင်ပါတယ်

ဥပမာ - Image Loading

- ပုံကြီးတွေကို ချက်ချင်း load မလုပ်ဘဲ
- Proxy object က placeholder အနေနဲ့ ရှိနေပြီး
- တကယ် display လုပ်တဲ့အချိန်မှ ပုံအစစ်ကို load လုပ်ပါတယ်

### အားသာချက်များ (Pros)

- Resource တွေကို ပိုမိုထိရောက်စွာ သုံးစွဲနိုင်ခြင်း
- Security control တွေ ထပ်ထည့်နိုင်ခြင်း
- Lazy loading နဲ့ caching တွေ လုပ်နိုင်ခြင်း

### အားနည်းချက်များ (Cons)

- Response time ပိုကြာနိုင်
- Code duplication ဖြစ်နိုင်
- Extra layer ကြောင့် complexity တိုးလာ

</div>