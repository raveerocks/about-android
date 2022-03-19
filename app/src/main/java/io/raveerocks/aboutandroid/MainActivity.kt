package io.raveerocks.aboutandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import io.raveerocks.aboutandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.bioText.text = HtmlCompat.fromHtml(applicationContext.getString(R.string.bio), HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}