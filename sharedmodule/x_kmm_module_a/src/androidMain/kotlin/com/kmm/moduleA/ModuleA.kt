package com.kmm.moduleA
import com.kmm.core.PlatformUtil

class ModuleA(private val platformUtil: PlatformUtil) {
    fun getPlatform(): String {
        return "@@@ Your platform is ${platformUtil.platform()}"
    }
}