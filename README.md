# crypto-shell
Interaction with Binance API over shell commands.

Commands:
```
Built-In Commands
       help: Display help about available commands
       stacktrace: Display the full stacktrace of the last error.
       clear: Clear the shell screen.
       quit, exit: Exit the shell.
       history: Display or save the history of previously run commands
       version: Show version info
       script: Read and execute commands from a file.

Shell Commands
       last-price: Get last price by symbol (ex. ETHUSDT; BTCUSDT; etc.)
```

Example:
```
shell:>last-price --symbol ETHUSDT
Last price: 1851.14000000
shell:>
```
