listView('Triggers') {
    description('Automatic triggers')
    jobs {
        name('trigger_weekly_host_os_build')
        name('trigger_nightly_host_os_build')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
    }
}
