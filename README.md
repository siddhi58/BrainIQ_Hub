✦BrainIQ Hub 🧠

A quiz app that tests four dimensions of intelligence — IQ, EQ, Social Intelligence, and Brain Type — 
and tells you what your score actually means.


✦ Screenshots





✦ Features

-4 quiz categories — IQ, EQ, Social Intelligence, Brain Type
-Each category has its own unique scoring logic (not just right/wrong)
-Result screen explains what your score means in plain language
-Quiz history saved locally — track your scores over time
-Smooth screen transitions and card-based UI


 ✦Tech

Kotlin · XML · CardView · SharedPreferences · Intents · Android Studio


✦Run it

bashgit clone https://github.com/siddhi58/BrainIQ_Hub.git

Open in Android Studio → let Gradle sync → hit Run. Needs API 21+.


✦ What I learned building this
Honestly, the most enjoyable part was building the UI — getting the animations right, making buttons feel responsive, and seeing the CardView layouts actually come together on screen. There's something satisfying about a transition that just feels smooth.

The scoring logic was another highlight. EQ and IQ don't work the same way — emotional intelligence isn't about correct answers, it's about patterns. Designing two separate systems that both felt fair took more thinking than I expected, and I enjoyed every bit of it.

History tracking was a late addition. Midway through testing I realized there was no way to look back at past scores, so I wired it up with SharedPreferences. It was a small feature but it made the app feel genuinely complete.


✦ What I'd improve next
Swap hardcoded questions for a Room database
Add a share result feature
Dark mode


Siddhi Bidkar · LinkedIn · GitHub · siddhibidkar04@gmail.com
