# BrainIQ Hub 🧠

A modern Android application designed to test four core dimensions of intelligence—IQ, EQ, Social Intelligence, and Brain Type—featuring custom dynamic scoring logic and an intuitive dashboard.

---

### 📱 Application Previews

()

---

### ✦ Key Features

-🧠 Multi-Dimensional Assessment: Four different tests that check your IQ, EQ, Social Skills, and Brain Type.

-📊 Custom Analytics Engine: Special code that looks at your answer patterns to give a smart score, instead of just simple right or wrong points.

-⏱️ Score History Tracking: The app saves your past scores on your phone so you can see how much you improve over time.

-🎨 Modern Material UI: Clean and nice-looking screens that use cards and move smoothly when you use them.

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

### 💡 What I learned building this 

-Honestly, the most enjoyable part was building the UI — getting the animations right, making buttons feel responsive, and seeing the CardView layouts actually come together on screen. There's something satisfying about a transition that just feels smooth.

The scoring logic was another highlight. EQ and IQ don't work the same way — emotional intelligence isn't about correct answers, it's about patterns. Designing two separate systems that both felt fair took more thinking than I expected, and I enjoyed every bit of it.

History tracking was a late addition. Midway through testing I realized there was no way to look back at past scores, so I wired it up 
with SharedPreferences. It was a small feature but it made the app feel genuinely complete.

---

### 🔮 Future Roadmap
- Database Upgrade: Change from SharedPreferences to Room Database to save user scores better.
- Dark Mode: Add a setting to switch the app background between light and dark themes.
---

### 🤝 Connect with Me
Siddhi Bidkar • [LinkedIn](https://linkedin.com) • [GitHub](https://github.com/siddhi58) • siddhibidkar04@gmail.com

