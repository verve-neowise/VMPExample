package io.neowise.samples.vmpexample.ui.contracts

interface Counter {

    interface View : Base.View {
        fun updateCounter(value: Int)
    }

    interface Presenter: Base.Presenter<View> {
        fun increment()
        fun decrement()
    }
}