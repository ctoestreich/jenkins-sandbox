includeTargets << grailsScript("Init")

target(main: "Add some style to the gmetrics report") {
    ant.mkdir(dir:'target/gmetrics')

    ant.xslt style: "gmetrics/default.xslt", out: "target/gmetrics/gmetrics.html", in: 'target/gmetrics.xml'
    ant.copy(todir: 'target/gmetrics') {
        fileset(dir: 'gmetrics') {
            include name: 'default.css'
            include name: '*.png'
        }
    }
}

setDefaultTarget(main)