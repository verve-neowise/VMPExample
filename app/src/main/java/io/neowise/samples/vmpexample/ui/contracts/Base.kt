package io.neowise.samples.vmpexample.ui.contracts

interface Base {

    interface View {
    }

    interface Presenter<T : View> {
        fun attachView(view: T)
    }
}