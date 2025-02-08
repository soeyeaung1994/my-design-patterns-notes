## Singleton Pattern

### ဒီ Singleton Pattern က object တစ်ခုကနေ instance တစ်ခုပဲရှိစေချင်တဲ့အခါ သုံးပါတယ်။ လက်တွေ့အသုံးချနိုင်တဲ့ နေရာတွေကတော့ ...

<div style="font-size:14px;line-height: 2;">

- **Database connection manager** - database နဲ့ချိတ်ဆက်မှု တစ်ခုပဲရှိစေချင်တဲ့အခါ

- **အင်္ဂလိပ်စာ spellchecker** - စာလုံးပေါင်း မှန်/မှားစစ်တဲ့ instance တစ်ခုပဲလိုတဲ့အခါ

- **System configuration** - system setting တွေကို တစ်နေရာထဲကနေ manage လုပ်ချင်တဲ့အခါ

- **Print spooler** - printer နဲ့ချိတ်ဆက်တဲ့ service တစ်ခုပဲလိုတဲ့အခါ

- **Window manager** - OS မှာ window တွေကို manage လုပ်တဲ့ service တစ်ခုပဲလိုတဲ့အခါ

- **Logger** - log တွေကို တစ်နေရာထဲကပဲ ရေးချင်တဲ့အခါ

- **Cache manager** - cache တွေကို တစ်နေရာထဲကပဲ စီမံချင်တဲ့အခါ

ဒီ Pattern အတွက် သုံးထားတဲ့ Sample code တွေမှာတော့

- Java 21 မှာပါလာတဲ့ feature တွေဖြစ်တဲ့ Record classes နဲ့ Text blocks တွေကို သုံးထားပါတယ်
- Thread-safety အတွက် ConcurrentHashMap စတာတွေကို သုံးထားပါတယ်
- Initialization-on-demand holder idiom နည်းလမ်းကိုသုံးပြီး lazy loading လုပ်နိုင်ပါတယ် (ဒီမှာတော့ eager initialization ကိုပဲသုံးထားပါတယ်)
- Modern Java practices တွေဖြစ်တဲ့ Optional, record classes တွေကို သုံးထားပါတယ်

ဒီ code တွေက basic example တွေပဲဖြစ်ပြီး real-world application တွေမှာတော့ error handling, logging, configuration management စတာတွေ ထပ်ထည့်ရပါလိမ့်မယ်။

</div>

### တခြား ကိုယ်စဉ်းစားမိသေးတဲ့ ဥပမာလေးတွေလည်းရှိတယ်ဆိုရင် ဒီမှာ အကြံပြုပြီး ထပ်မံဖြည့်စွက်ပေးနိုင်ပါတယ်။