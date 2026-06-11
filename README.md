# BrainIQ Hub 🧠

A modern Android application designed to test four core dimensions of intelligence—IQ, EQ, Social Intelligence, and Brain Type—featuring custom dynamic scoring logic and an intuitive dashboard.

---

### 📱 Application Previews

> 💡 **Tip for Siddhi:** Drag and drop your screenshots directly into the spaces below inside the GitHub editor!

| Main Menu & Quiz Selection | Interactive Test Interface | Comprehensive Results |
| :---: | :---: | :---: |
| [DROP SCREENSHOT 1 HERE] | [DROP SCREENSHOT 2 HERE] | [DROP SCREENSHOT 3 HERE] |

| Score History Tracker | Detailed Analytics |
| :---: | :---: |
| [DROP SCREENSHOT 4 HERE] | [DROP SCREENSHOT 5 HERE] |

---

### ✦ Key Features

- **🧠 Multi-Dimensional Assessment: Four different tests that check your IQ, EQ, Social Skills, and Brain Type.
📊 Custom Analytics Engine: Special code that looks at your answer patterns to give a smart score, instead of just simple right or wrong points.
⏱️ Score History Tracking: The app saves your past scores on your phone so you can see how much you improve over time.
🎨 Modern Material UI: Clean and nice-looking screens that use cards and move smoothly when you use them.

---

### 🛠️ Tech Stack & Architecture

- **Language:** Kotlin (100%)
- **Architecture Flow:** Component Intents utilizing granular Bundle data structures.
- **Local Storage:** SharedPreferences (Local Score History Serialization)
- **UI Architecture:** XML Layouts, CardView Frameworks, animation buttons 

---

### 🚀 Getting Started

```bash
git clone https://github.com
```
1. Import the project into **Android Studio**.
2. Let Gradle synchronize successfully.
3. Deploy onto an active Android emulator or physical device (Target API 21+).

---

### 💡 Engineering Journey & Lessons Learned

Building BrainIQ Hub allowed me to dive deep into custom data architectures and layout animations. The most rewarding challenge was designing the scoring engines; because EQ and IQ operate on entirely different metrics, I engineered two independent evaluation pipelines to process the distinct input patterns accurately. 

Additionally, recognized mid-development that users needed historical validation, I integrated a local storage tracking layer via SharedPreferences to cleanly serialize and persist user score arrays.

---

### 🔮 Future Roadmap
- Database Upgrade: Change from SharedPreferences to Room Database to save user scores better.
- Dark Mode: Add a setting to switch the app background between light and dark themes.
---

### 🤝 Connect with Me
Siddhi Bidkar • [LinkedIn](https://linkedin.com) • [GitHub](https://github.com/siddhi58) • siddhibidkar04@gmail.com

