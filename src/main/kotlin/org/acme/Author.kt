package org.acme

import com.tradetested.pim.cfg.persistence.AbstractJpaPersistable
import javax.persistence.Entity

@Entity
open class Author : AbstractJpaPersistable<Long>() {
    lateinit var name: String
        protected set
}