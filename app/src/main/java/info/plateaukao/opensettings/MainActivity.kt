package info.plateaukao.opensettings

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(android.provider.Settings.ACTION_SETTINGS))
        finish()
    }
}