## Combined Pattern (Document Management System)

<div style="font-size:14px;line-height: 2;">

တခြား Structural Pattern တွေကို combine လုပ်တဲ့ ဥပမာအနေနဲ့ **Document Management System** တစ်ခုကို ပြပါမယ်။
Bridge + Composite + Proxy pattern တွေကို တွဲသုံးမှာဖြစ်ပါတယ်။

ဒဒီ System မှာ၊

**Bridge Pattern ကို Document နဲ့ Renderer ကြား ချိတ်ဆက်ဖို့သုံးထားပါတယ်**

* Document တွေက format မျိုးစုံ (PDF, Word) ရှိနိုင်ပါတယ်
* Format တစ်ခုချင်းစီအတွက် သီးခြား renderer တွေရှိပါတယ်
* Bridge pattern က document နဲ့ renderer တွေကို သီးခြားစီ ပြောင်းလဲနိုင်စေပါတယ်

**Composite Pattern ကို folder structure အတွက်သုံးထားပါတယ်**

* Folder တွေထဲမှာ Document တွေရော နောက်ထပ် Folder တွေပါ ထည့်လို့ရပါတယ်
* Document တွေရော Folder တွေကိုပါ တူညီတဲ့ interface နဲ့ access လုပ်နိုင်ပါတယ်

**Proxy Pattern ကို lazy loading အတွက်သုံးထားပါတယ်**

* Document တွေကို ချက်ချင်း load မလုပ်ဘဲ လိုမှ load လုပ်ပါတယ်
* Memory သုံးစွဲမှုကို optimize လုပ်နိုင်ပါတယ်
<hr>

### လက်တွေ့မှာ Combined Patterns တွေကို အသုံးများတဲ့ System တွေက ဒါတွေရှိပါမယ်။

**၁။ Content Management Systems (CMS)**

* WordPress, Drupal စတဲ့ CMS တွေမှာ ဒီလို pattern တွေကို တွဲသုံးကြပါတယ်
* Content type မျိုးစုံကို handle လုပ်ဖို့ Bridge Pattern
* Menu, Widget စတာတွေအတွက် Composite Pattern
* Caching အတွက် Proxy Pattern

**၂။ File Explorers**

* Windows Explorer, Mac Finder စတာတွေမှာလည်း pattern တွေကို တွဲသုံးပါတယ်
* File/Folder structure အတွက် Composite
* File preview အတွက် Bridge
* Thumbnail caching အတွက် Proxy

**၃။ Graphics Editing Software**

* Photoshop, Illustrator လို software တွေမှာလည်း pattern တွေ တွဲသုံးပါတယ်
* Layer system အတွက် Composite
* Rendering engine အတွက် Bridge
* Undo/Redo အတွက် Command + Memento

**၄။ Enterprise Document Management**

* SharePoint, Alfresco လို system တွေမှာ pattern တွေစုံအောင်သုံးပါတယ်
* Version control အတွက် Proxy
* Permission system အတွက် Decorator
* Document hierarchy အတွက် Composite

**၅။ Cloud Storage Solutions**

* Google Drive, Dropbox စတာတွေမှာလည်း pattern တွေတွဲသုံးပါတယ်
* Sync mechanism အတွက် Proxy
* Folder structure အတွက် Composite
* File sharing အတွက် Facade

### Pattern တွေ တွဲသုံးတဲ့အခါ သတိထားရမယ့်အချက်များ

**Over-engineering မဖြစ်စေရန်**

* လိုအပ်တဲ့ pattern တွေကိုပဲ ရွေးသုံးပါ
* Project scale ပေါ်မူတည်ပြီး ဆုံးဖြတ်ပါ

**Performance ကို ထည့်သွင်းစဉ်းစားရန်**

* Pattern တွေများလာရင် overhead များလာနိုင်ပါတယ်
* Critical path တွေမှာ optimization လုပ်ပါ

**Code Maintainability**

* Pattern တွေများလာရင် code ပိုရှုပ်ထွေးလာနိုင်ပါတယ်
* Documentation ကောင်းကောင်းရေးထားပါ
* Unit test တွေ ရေးထားပါ

</div>