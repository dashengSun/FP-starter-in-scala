import org.atnos.eff._

// to create the effect
import org.atnos.eff.option._

// to access the runOption method
import org.atnos.eff.syntax.option._

fromOption(Option(1)).runOption

val result = Eff.pure(1)

result.map(x => {
  println(x)
  x+1
})
