package com.kmm.moduleA

import com.kmm.core.PlatformUtil

class CommonModuleA(private val platformUtil: PlatformUtil) {
    fun getPlatform(): String {
        return "@@@ Your platform is ${platformUtil.platform()}"
    }
}