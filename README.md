<h1>About Android</h1>

About Android is a simple app built using [Android.](https://www.android.com/) This project explores the basics of Android, such as creating text views, image views,
 and basic layout such as LinearLayout and ScrollView. The following is the `MainActivity` class loads the content from the string resources and format the HTML content within the TextView.

 ```kotlin
 class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.bioText.text = HtmlCompat.fromHtml(applicationContext.getString(R.string.bio), HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}
 ```
 
 The app looks like the following on a real device.
 
 
 <img align="left" width=396 src="https://github.com/raveerocks/about-android/blob/main/screenshot.png" alt="screenshot" />
 
 
