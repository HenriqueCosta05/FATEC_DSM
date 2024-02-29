from typing import Union
from fastapi import FastAPI, HTTPException, Request
from fastapi.responses import FileResponse
from fastapi.staticfiles import StaticFiles

app = FastAPI()
app.mount("/web", StaticFiles(directory="../frontend"), name="web")

@app.get("/app/home")
def read_root():
    return FileResponse("../frontend/index.html")
