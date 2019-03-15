package be.zvz.deepscore.cnn

import android.content.res.Resources
import be.zvz.deepscore.R
import org.deeplearning4j.nn.modelimport.keras.KerasModelImport
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork
import java.net.URI

class CnnPredict {
    fun run() {
        val simpleMlp = URI("android.resource://be.zvz.deepscore/" + Resources.getSystem().getResourcePackageName(R.raw.model)).path
        val model: MultiLayerNetwork = KerasModelImport.importKerasSequentialModelAndWeights(simpleMlp)

    }
}