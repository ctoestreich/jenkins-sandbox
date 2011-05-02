includeTargets << grailsScript("Init")
includeTargets << new File("${gmetricsPluginDir}/scripts/Gmetrics.groovy")
includeTargets << new File("${codenarcPluginDir}/scripts/Codenarc.groovy")

target(main: "Add some style to the gmetrics report") {
  depends(compile, codenarc, gmetrics)

  stylizeGmetrics()
  stylizeCodenarc()
}

target(stylizeGmetrics: "Add some style to the gmetrics report") {
  println "add some style to the gmetrics report"
  ant.mkdir(dir: 'target/gmetrics')
  ant.xslt style: "reports/gmetrics.xslt", out: "target/gmetrics/gmetrics.html", in: 'target/gmetrics.xml'
  ant.copy(todir: 'target/gmetrics') {
    fileset(dir: 'reports') {
      include name: 'default.css'
      include name: '*.png'
      include name: '*.gif'
    }
  }
}

target(stylizeCodenarc: "add some style to the codenarc report") {
  println "Add some style to the codenarc report"
  ant.mkdir(dir: 'target/codenarc')
  ant.xslt style: "reports/codenarc.xslt", out: "target/codenarc/codenarc.html", in: 'target/codenarc.xml'
  ant.copy(todir: 'target/codenarc') {
    fileset(dir: 'reports') {
      include name: 'default.css'
      include name: '*.png'
      include name: '*.gif'
    }
  }
}

setDefaultTarget(main)