package optional.types

class SelectInput[T](var value: Option[T], val options: Set[T])

object SelectInput{
  def apply[T](options: T*) = new SelectInput[T](value = None, options = options.toSet)
}
