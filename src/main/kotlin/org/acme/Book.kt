package org.acme

import com.tradetested.pim.cfg.persistence.AbstractJpaPersistable
import javax.persistence.*

@Entity
open class Book : AbstractJpaPersistable<Long>() {

    lateinit var name: String
        protected set

    @ManyToOne
    lateinit var author: Author
        protected set
}