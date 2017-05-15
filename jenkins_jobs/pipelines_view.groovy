listView('Pipelines') {
    description('Host OS builds pipelines')
    jobs {
        name('pipeline_infrastructure')
        name('pipeline_builds')
        name('pipeline_versions')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
