##What is the defference
when we parse json string to a object, specially in a json API, some fields of the object should not be null.But, when gson parse
json string, it does not validate this, if the field is not in the json string, it will be parsed to null.
so, I declare an annotation **NotNull**, if there are some fields you don't want them be null, you can add the annotation like this:
```
@NotNull
public String a;
```
if the value of "**a**" is null, then it will throw a JsonSyntaxException
