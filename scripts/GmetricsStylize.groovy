includeTargets << grailsScript("Init")

target(main: "Add some style to the gmetrics report") {

    ant.xslt style: "gmetrics/default.xslt", out: "target/gmetrics/default.html", in: 'target/gmetrics.xml'
    ant.copy(todir: 'target/gmetrics') {
        fileset(dir: 'gmetrics') {
            include name: 'default.css'
            include name: '*.png'
        }
    }

    //def factory = TransformerFactory.newInstance()
    //def transformer = factory.newTransformer(new StreamSource(new StringReader(xslt())))
    //transformer.transform(new StreamSource(new StringReader(input)), new StreamResult(System.out))

}

setDefaultTarget(main)