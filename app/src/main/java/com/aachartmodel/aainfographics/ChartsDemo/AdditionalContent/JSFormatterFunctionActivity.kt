/**
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 */

/**

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore-Kotlin/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */
package com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartCreator.AAChartView
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction1
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction2
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction3
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction4
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customArearangeChartTooltip
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customBoxplotTooltipContent
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customDoubleXAxesChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customStackedAndGroupedColumnChartTooltip
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customTooltipWhichDataSourceComeFromOutSideRatherThanSeries
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customYAxisLabels
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customYAxisLabels2
import com.aachartmodel.aainfographics.R

class JSFormatterFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction)
        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaOptions = configureTheChartOptions(chartType)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)

    }

    private fun configureTheChartOptions(chartType: String): AAOptions {
        when (chartType) {
            "formatterFunction1" -> return customAreaChartTooltipStyleWithFormatterFunction1()
            "formatterFunction2" -> return customAreaChartTooltipStyleWithFormatterFunction2()
            "formatterFunction3" -> return customAreaChartTooltipStyleWithFormatterFunction3()
            "formatterFunction4" -> return customAreaChartTooltipStyleWithFormatterFunction4()
            "formatterFunction5" -> return customBoxplotTooltipContent()
            "customYAxisLabels" -> return customYAxisLabels()
            "customYAxisLabels2" -> return customYAxisLabels2()
            "customStackedAndGroupedColumnChartTooltip" -> return customStackedAndGroupedColumnChartTooltip()
            "customDoubleXAxesChart" -> return customDoubleXAxesChart()
            "customArearangeChartTooltip" -> return customArearangeChartTooltip()
             "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter" ->
                return customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter()
             "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries" ->
                return customTooltipWhichDataSourceComeFromOutSideRatherThanSeries()

        }
        return customAreaChartTooltipStyleWithFormatterFunction1()
    }
}
