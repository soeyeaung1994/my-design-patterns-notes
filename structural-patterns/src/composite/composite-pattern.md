## Composite Pattern

<div style="font-size:14px;line-height: 2;">

### ရည်ရွယ်ချက်

Tree-like structure တွေကို ကိုင်တွယ်ဖို့အတွက် အသုံးပြုပါတယ် <br>
Individual object တွေနဲ့ object စုပေါင်းထားတာတွေကို တူညီတဲ့ပုံစံနဲ့ အသုံးပြုနိုင်အောင် လုပ်ပေးပါတယ်

ဥပမာ - File System

File တွေနဲ့ Directory တွေကို တူညီတဲ့ interface (FileSystemComponent) နဲ့ အသုံးပြုနိုင်ပါတယ်
Directory ထဲမှာ File တွေ၊ နောက်ထပ် Directory တွေ ထပ်ထည့်နိုင်ပါတယ်
ဒါကြောင့် file system မှာရှိတဲ့ hierarchy ကို လွယ်ကူစွာ manage လုပ်နိုင်ပါတယ်

### အားသာချက်များ (Pros)

- Complex structure တွေကို ရိုးရှင်းစွာ ကိုင်တွယ်နိုင်ခြင်း
- ထပ်တိုးချဲ့ရလွယ်ကူခြင်း
- Client code ပိုရိုးရှင်းလာခြင်း

### အားနည်းချက်များ (Cons)

- Component တိုင်းမှာ တူညီတဲ့ interface ရှိရမှာမို့ design ပိုရှုပ်ထွေးလာနိုင်
- Component တွေအကုန်လုံးကို တူညီတဲ့ပုံစံနဲ့ treat လုပ်ရတာက တစ်ခါတစ်ရံ မသင့်တော်နိုင်
- Type safety issues ဖြစ်နိုင်

</div>