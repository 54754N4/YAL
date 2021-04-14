# YAL
Yet another language 

## Description

Starts with `Kotlin`'s grammar as base, and adds features from `Python`, `C#` and `Java`'s grammars.
This is just the `front-end` of a three-phase compiler for now.

### Checklist

##### Done
- removed `var`, `val` & `fun` keywords
- added standard `for` loop (on steroids)
- added short-circuiting bool ops (`&` and `|`)
- added multi catch + `try`/`catch`/`finally` 1-liner versions
- added list comprehensions
- added list splicing (using `#` instead of `:` because can conflict with `::` reference operator)
- added null-coalescing/elvis assignment operator `?:=`
- added multiple variable arity function parameters (Note: have to be separated by `;` if more than one in a single function declaration)
- changed multi-line string to use `m"` start operator (e.g. `m"I can span many lines"`)
- added unescaped strings using `@"` start operator (e.g. `@"C:\path\to\file.txt` [backslashes don't need to be escaped + also supports string interpolation/templates])
