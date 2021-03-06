package com.zackratos.ultimatebarx.library

import com.zackratos.ultimatebarx.library.annotation.Type
import com.zackratos.ultimatebarx.library.bean.BarConfig

class UltimateBarX {
    companion object {

        const val STATUS_BAR = 0
        const val NAVIGATION_BAR = 1

        @JvmStatic
        fun create(@Type type: Int): BarConfig.Builder =
            when (type) {
                STATUS_BAR -> BarConfig.Builder.defaultStatusBarBuilder()
                NAVIGATION_BAR -> BarConfig.Builder.defaultNavigationBarBuilder()
                else -> BarConfig.Builder(type)
            }
    }

}