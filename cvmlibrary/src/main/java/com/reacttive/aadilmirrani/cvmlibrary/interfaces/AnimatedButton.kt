package com.reacttive.aadilmirrani.cvmlibrary.interfaces

interface AnimatedButton {
    fun startAnimation()
    fun revertAnimation()
    fun revertAnimation(onAnimationEndListener: OnAnimationEndListener?)
    fun dispose()
    fun setProgress(progress: Int)
    fun resetProgress()
}