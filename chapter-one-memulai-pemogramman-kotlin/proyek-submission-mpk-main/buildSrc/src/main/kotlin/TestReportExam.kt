import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

abstract class TestReportExam : DefaultTask() {
    @TaskAction
    fun run() {
        println('\u000C')

        val file = "${project.buildDir}/test-results/test/TEST-ExamTest.xml"
        if (!File(file).isFile) {
            return println("Test report no found")
        }

        val factory = DocumentBuilderFactory.newInstance()
        val builder = factory.newDocumentBuilder()
        val doc = builder.parse(File(file))

        doc.normalizeDocument()

        val testcaseNodes = doc.getElementsByTagName("testcase")
        repeat(testcaseNodes.length) {
            val testsuite = testcaseNodes.item(it) as Element
            val failure = testsuite.getElementsByTagName("failure").item(0) as? Element
            if (failure !== null) {
                val testcaseName = testsuite.getAttribute("name")
                val errorMessage = failure.getAttribute("message").split("AssertionFailedError: ").last()

                colored(enabled = true) {
                    println( " ERROR ".red.bold + " " + errorMessage.bold.reverse + " " + testcaseName)
                }
            } else {
                colored(enabled = true) {
                    println(" SUCCESS ".green.bold + testsuite.getAttribute("name"))
                }
            }
        }

    }
} 