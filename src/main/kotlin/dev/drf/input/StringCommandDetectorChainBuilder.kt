package dev.drf.input

class StringCommandDetectorChainBuilder {
    private lateinit var headChain: StringCommandDetectorChain
    private lateinit var currentChain: StringCommandDetectorChain

    fun addChain(chain: StringCommandDetectorChain): StringCommandDetectorChainBuilder {
        if (!::headChain.isInitialized) {
            headChain = chain
        }
        if (::currentChain.isInitialized) {
            currentChain.next = chain
            currentChain = chain
        } else {
            currentChain = chain
        }
        return this
    }

    fun build(): StringCommandDetectorChain {
        return headChain
    }
}