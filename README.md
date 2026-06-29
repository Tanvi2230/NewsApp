# 📰 NewsApp

A modern Android news application that fetches and displays the latest headlines from around the world in real-time using the **NewsData.io API**. Built with clean architecture principles and a smooth, user-friendly interface.

---

## 🚀 Live Demo

▶️ **[Try the app live on Appetize.io](https://appetize.io/app/b_4xnpfor665r63hkp4up3thkm7a)**

> No installation needed — run it directly in your browser!

---

## 📱 About the App

NewsApp is an Android application that brings you the latest news from across the globe. The app fetches real-time news articles using the NewsData.io REST API and displays them in a clean, scrollable list. Users can tap on any article to read the full story in their browser.

The app is designed with simplicity in mind — a single screen that loads news instantly on launch, with a progress bar while data is being fetched, and graceful error handling if something goes wrong.

---

## ✨ Features

- 🌍 **Real-time news** — fetches the latest headlines on every launch
- 🖼️ **Article images** — news thumbnails loaded smoothly with Glide
- 🔗 **Read full article** — tap any news card to open the full article in browser
- ⏳ **Loading indicator** — progress bar shown while fetching data
- 🌐 **Language filter** — fetches English news by default
- 🔒 **SSL handling** — custom OkHttp client for secure API calls
- 📋 **RecyclerView UI** — smooth and efficient scrolling list

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| **Java** | Primary programming language |
| **Android Studio** | IDE for development |
| **Retrofit 2** | HTTP client for REST API calls |
| **Gson Converter** | JSON response parsing |
| **OkHttp** | HTTP client with SSL configuration |
| **Glide** | Fast and efficient image loading |
| **RecyclerView** | Displaying list of news articles |
| **NewsData.io API** | Source of real-time news data |

---

## 🏗️ Project Structure

```
NewsApp/
├── app/src/main/java/com/example/newsapp/
│   ├── MainActivity.java       # Main screen, API call logic
│   ├── NewsAdapter.java        # RecyclerView adapter for news list
│   ├── Article.java            # Model class for a news article
│   ├── NewsResponse.java       # Model class for API response
│   └── ApiService.java         # Retrofit API interface
├── app/src/main/res/
│   ├── layout/activity_main.xml    # Main screen layout
│   └── layout/item_news.xml        # Single news card layout
```

---

## 📡 API Used

**[NewsData.io](https://newsdata.io)** — Free news API

- **Endpoint:** `GET https://newsdata.io/api/1/latest`
- **Parameters:**
  - `apikey` — Your API key
  - `language` — Language filter (e.g., `en` for English)
- **Response:** JSON with list of articles containing `title`, `link`, and `image_url`

---

## ⚙️ Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android device or emulator (API level 21+)
- NewsData.io API key (free at [newsdata.io](https://newsdata.io))

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Tanvi2230/NewsApp.git
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Click `File > Open` and select the cloned folder

3. **Add your API Key**
   - Open `MainActivity.java`
   - Replace the API key:
   ```java
   String API_KEY = "your_api_key_here";
   ```

4. **Run the app**
   - Connect your Android device or start an emulator
   - Click the **Run** button ▶️

---

## 📦 Download APK

Download the latest APK directly from [GitHub Releases](https://github.com/Tanvi2230/NewsApp/releases) and install it on any Android device.

> Enable **"Install from Unknown Sources"** in your phone settings before installing.

---

## 🔮 Future Improvements

- [ ] Add news categories (Sports, Technology, Business, etc.)
- [ ] Search functionality
- [ ] Bookmark/Save articles
- [ ] Dark mode support
- [ ] Share articles with friends
- [ ] Offline reading support

---

## 🙋‍♀️ Author

**Tanvi Shrivastava**
- GitHub: [@Tanvi2230](https://github.com/Tanvi2230)
- Email: tanvishrivastava230704@acropolis.in

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
