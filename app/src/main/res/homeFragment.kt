import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import edu.kaleb.r.cosgrave.tp02_blueteam.HomeFragment

val homeFragment = HomeFragment()

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNav()

        setupSideNav()

        loadFragment(homeFragment)
    }

    private fun setupSideNav() {
        setupSideNavToggle()

        val sideNav = findViewById<NavigationView>(R.id.nav_side_menu)
        sideNav.setNavigationItemSelectedListener {
            checkMenuClick(it)
            true
        }
    }

    private fun setupSideNavToggle() {
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout_menu)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupBottomNav() {
        var bottomNav = findViewById<BottomNavigationView>(R.id.nav_bottom)

        bottomNav.setOnNavigationItemSelectedListener {
            checkMenuClick(it)
            true
        }
    }

    private fun checkMenuClick(item: MenuItem) {
        when(item.itemId) {
            R.id.nav_home -> loadFragment(homeFragment)
            R.id.nav_favorites -> loadFragment(favoritesFragment)
            R.id.nav_settings -> loadFragment(settingsFragment)
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
            checkMenuClick(item)

        return super.onOptionsItemSelected(item)
    }