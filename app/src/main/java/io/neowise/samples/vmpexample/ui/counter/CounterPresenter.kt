package io.neowise.samples.vmpexample.ui.counter

import io.neowise.samples.vmpexample.ui.contracts.Counter

class CounterPresenter : Counter.Presenter {

    private lateinit var view: Counter.View

    private var value = 0

    override fun attachView(view: Counter.View) {
        this.view = view
    }

    override fun increment() {
        view.updateCounter(++value)
    }

    override fun decrement() {
        view.updateCounter(--value)
    }
}