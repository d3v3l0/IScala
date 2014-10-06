package org.refptr.iscala
package tests

import java.io.File
import org.specs2.mutable.Specification

class NotebooksSpec extends Specification with NotebookUtil {
    sequential

    "IScala's interpreter" should {
        "interpret Display.ipynb" in {
            new File("examples/Display.ipynb") must beInterpretable
        }.pendingUntilFixed("Add support for magics")
    }
}
