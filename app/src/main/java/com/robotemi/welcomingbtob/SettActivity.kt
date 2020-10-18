package com.robotemi.welcomingbtob

import android.content.Intent
import android.os.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_reseravation.*
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.robotemi.sdk.NlpResult
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest
import com.robotemi.sdk.listeners.*
import com.robotemi.sdk.listeners.OnBeWithMeStatusChangedListener.Companion.SEARCH
import com.robotemi.sdk.listeners.OnBeWithMeStatusChangedListener.Companion.TRACK
import com.robotemi.sdk.listeners.OnGoToLocationStatusChangedListener.Companion.COMPLETE
import com.robotemi.sdk.listeners.OnGoToLocationStatusChangedListener.Companion.GOING
import com.robotemi.sdk.listeners.OnGoToLocationStatusChangedListener.Companion.START
import com.robotemi.welcomingbtob.R.layout.activity_main
import com.robotemi.welcomingbtob.bluetooth.BluetoothManager
import com.robotemi.welcomingbtob.featurelist.FeatureListFragment
import com.robotemi.welcomingbtob.settings.SettingsActivity
import com.robotemi.welcomingbtob.settings.SettingsModel
import com.robotemi.welcomingbtob.utils.Const
import com.robotemi.welcomingbtob.utils.Constants.Companion.HOME_BASE_FROM_ROBOX
import com.robotemi.welcomingbtob.utils.Logs
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setting.*
import org.json.JSONObject
import org.koin.android.ext.android.inject
import timber.log.Timber
import java.io.File
import java.net.URI
import java.nio.charset.Charset
import java.util.*
import java.util.concurrent.TimeUnit
import java.util.logging.Level.parse
import kotlin.concurrent.timer


class SettActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val robot: Robot by inject()

        backbutton_setting.setOnClickListener()
        {
            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
            finish()
        }

        default1.setOnClickListener()
        {
            robot.saveLocation("default")
            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("default","default")
            startActivity(nextIntent)
            finish()
        }
        table_1.setOnClickListener()
        {
            robot.saveLocation("table1")
            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("table1","table1")
            startActivity(nextIntent)
            finish()
        }

        table_2.setOnClickListener()
        {
            robot.saveLocation("table2")
            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("table2","table2")
            startActivity(nextIntent)
            finish()
        }

        table_3.setOnClickListener()
        {
            robot.saveLocation("table3")
            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("table3","table3")
            startActivity(nextIntent)
            finish()
        }

        table_4.setOnClickListener()
        {
            robot.saveLocation("table4")
            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("table4","table4")
            startActivity(nextIntent)
            finish()
        }

        table_5.setOnClickListener()
        {
            robot.saveLocation("table5")
            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("table5","table5")
            startActivity(nextIntent)
            finish()
        }
    }
}
